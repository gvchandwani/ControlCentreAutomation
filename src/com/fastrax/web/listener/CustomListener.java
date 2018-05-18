package com.fastrax.web.listener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.cipl.automation.property.PropertyManager;
import com.cipl.utility.MailUtility;
import com.cipl.webdriver.TestBase;

public class CustomListener implements ISuiteListener {

	public void onStart(ISuite suite) {

	}

	public void onFinish(ISuite suite) {
		if (PropertyManager.getResourceBundle().getString("sendEmailAfterExecutionHTML").equalsIgnoreCase("true")) {
			StringWriter writer = new StringWriter();
			try {

				File file = new File(PropertyManager.getResourceBundle().getString("sendHtmlFile"));
				IOUtils.copy(new FileInputStream(file), writer);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String fileAsString = writer.toString();
			int total = Integer.parseInt(PropertyManager.getResourceBundle().getProperty("PassCount").toString())
					+ Integer.parseInt(PropertyManager.getResourceBundle().getProperty("FailCount").toString())
					+ Integer.parseInt(PropertyManager.getResourceBundle().getProperty("SkipCount").toString());
			fileAsString = fileAsString.replace("${TotalTestRunCount}", String.valueOf(total));
			fileAsString = fileAsString.replace("${PassCount}",
					PropertyManager.getResourceBundle().getString("PassCount"));
			fileAsString = fileAsString.replace("${FailCount}",
					PropertyManager.getResourceBundle().getString("FailCount"));
			fileAsString = fileAsString.replace("${SkipCount}",
					PropertyManager.getResourceBundle().getString("SkipCount"));
			fileAsString = fileAsString.replace("${ReportLink}",
					PropertyManager.getResourceBundle().getString("ReportLink"));

			Map<String, File> inlineImages = new HashMap<String, File>();
			inlineImages.put("imageLogo",
					new File("resources\\common\\EmailTemplate\\image\\Cygnet-Infotech-Logo.png"));
			inlineImages.put("testResult", new File("resources\\common\\EmailTemplate\\image\\banner.png"));
			inlineImages.put("imageUpper", new File("resources\\common\\EmailTemplate\\image\\imageUpper.png"));
			inlineImages.put("imageLowwer", new File("resources\\common\\EmailTemplate\\image\\imageLowwer.png"));
			inlineImages.put("imageLine", new File("resources\\common\\EmailTemplate\\image\\imageLine.png"));

			try {
				MailUtility.sendMailWithHtmlView(PropertyManager.getResourceBundle().getString("mail.username"),
						PropertyManager.getResourceBundle().getString("mail.password"),
						PropertyManager.getResourceBundle().getString("mail.to"),
						PropertyManager.getResourceBundle().getString("mail.subject"), fileAsString, inlineImages);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		TestBase.getDriver().quit();
	}	
}
