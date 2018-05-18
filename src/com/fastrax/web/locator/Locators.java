package com.fastrax.web.locator;

/**
 * 
 * Contains Locators of all Pages
 *
 */

public interface Locators {

	public interface Pages {

		public interface TemplatePageLocators {
			String LOC_ADD_NEW_BTN = "css=a.btn.btn-sm.btn-success";
			String LOC_SAVE_BTN = "xpath=.//*[@class='btn btn-sm btn-success saveSuccess' and @value='Save']";
			
			
			
			String LOC_LOADING = "css=#loading_all";
			String LOC_OK_BTN = "css=.btn.btn-success";
			String LOC_CANCEL_BTN = "xpath=.//button[text()='Cancel']";
			String LOC_DIALOG_WINDOW = "xpath=.//*[@id='syncBody']/div[3]/div/div";
			String LOC_UPLOAD_DIALOG_WINDOW = "xpath=.//*[@id='uploadModal']/div/div/div";
			String LOC_DASHBOARD_TABLE = "xpath=.//*[@id='tbodyIDs']/tr";
			String LOC_SESSION_TIMED_OUT_WINDOW = "xpath=.//*[@class='modal-body']//span[contains(text(),'Your session has timed out. We recommend closing your browser. ')]";
		}

		public interface LoginPageLocators {
			String LOC_TXT_USERNAME = "css=input#email.form-control";
			String LOC_TXT_PASSWORD = "css=input#password.form-control";
			String LOC_BTN_SIGNIN = "css=input.btn.btn-block.btn-info.mb";
			String LOC_LOGIN_ERROR_MSG = "css=div.alert.alert-danger.alert-fadeout.alert-dismissible ";
			String LOC_PASSWORD_ERROR_MSG = "id=password";
			String LOC_USERNAME_ERROR_MSG = "id=email";
			String LOC_SHOW_PASSWORD = "id=ShowPassword";
			String LOC_SHOW_PASSWORD_FIELD = "xpath=.//*[@id='PasswordTextBox' and @type='text']";
		}

		public interface DashboardPageLocators {
			String LOC_HOME_LINK = "css=a.logo-nav";
			String LOC_DASHBOARD_ACCOUNTS = "xpath=.//*[@id='mp-menu']//a[@href='#']/span[contains(text(),'Accounts')]";
		}
		
		public interface AccountsPageLocators{
			String LOC_ACCOUNTS_PAGE = "css=h2.fa-nav.fas.fa-users";
			String LOC_ACCOUNTS_IN_ACCOUNTS = "xpath=.//*[@id='mp-menu']//a[@href='https://petdemo.goftx.com/admin/access/accounts']/span[contains(text(),'Accounts')]";
			String LOC_ACCOUNTS_FIRST_NAME = "css=input#first_name.form-control";
			String LOC_ACCOUNTS_LAST_NAME = "css=input#last_name.form-control";
			String LOC_ACCOUNTS_EMAIL = "css=input#email.form-control";
			String LOC_ACCOUNTS_PASSWORD = "css=input#password.form-control";
			String LOC_ACCOUNTS_CONFIRM_PASSWORD = "css=input#password_confirmation.form-control";
			String LOC_ACCOUNTS_COMPANY = "css=input#company.form-control";
			String LOC_SELECT_SC_COMPANY = "css=select#sc_company.form-control";
			String LOC_SELECT_ACCOUNT_PACKAGE = "css=select#account_package_id.form-control";
			String LOC_ACCOUNTS_PHONE = "css=input#phone.form-control.phone-number";
			String LOC_ACCOUNTS_ADDRESS = "css=input#address.form-control";
			String LOC_ACCOUNTS_CITY = "css=input#city.form-control";
			String LOC_ACCOUNTS_STATE_DROPDOWN = "css=span#select2-state-container.select2-selection__rendered";
			String LOC_ACCOUNTS_STATE = "css=select#state.form-control.sel-2.select2-hidden-accessible";
			String LOC_ACCOUNTS_ZIP = "css=input#zip.form-control";
			String LOC_IS_ADMIN_TOGGLE_ON = "xpath=.//*[@id='accountPermissions']//*[@class='btn btn-default active toggle-off']";
			String LOC_IS_ADMIN_CHKBOX = "xpath=.//*[@id='j1_315_anchor']/i[1]";
			String LOC_ACCOUNTS_TABLE_NEXT_BTN = "xpath=.//*[@class='pagination']//i[@class='fas fa-angle-right']";
			
			String LOC_ACCOUNTS_USERS = "xpath=.//*[@id='mp-menu']//a[@href='https://petdemo.goftx.com/admin/access/users/index']/span[contains(text(),'Users')]";
			String LOC_ACCOUNTS_USERS_ACCNAME_DROPDOWN = "css=span#select2-account_id-container.select2-selection__rendered";
			String LOC_ACCOUNTS_USERNAME = "css=input#username.form-control";
			String LOC_ACTIVE_TOGGLE_ON = "xpath=.//label[contains(text(),'Active')]//following-sibling::div//*[@class='btn btn-default active toggle-off']";
			String LOC_ACCOUNTS_USERS_MAIN_ACCNAME_DROPDOWN = "css=span#select2-subAccount-container.select2-selection__rendered";

		}
		
		
		
		public interface RestoreVersionLocators {
			
			String LOC_VERSION_HISTORY_WINDOW = "xpath=.//div[@class='modal-dialog']//span[contains(text(),'Version History')]/../..";
			String LOC_VERSION_HISTORY_OPTION = "xpath=.//div[@id='context-menu']//span[text()='Version History']";
		}
		
		public interface AdminPanelLocators {
			String LOC_ADMIN_PANEL_DROPDOWN = "css=.btn.btn-default.dropdown-toggle.profile-nav";
			String LOC_DOWNLOAD_CLIENT_OPTION = "xpath=.//*[@id='applicationHost']//a[contains(text(),'Download Sync Client')]";
			String LOC_PROFILE_OPTION = "xpath=.//*[@id='applicationHost']//a[contains(text(),'Profile')]";
			String LOC_PROFILE_TITLE_DROPDOWN = "xpath=.//*[@id='profileDialog']//select[contains(@data-bind,'title')]";
			String LOC_PROFILE_WINDOW = "xpath=.//*[@id='profileDialog']/div[@class='modal-dialog']";
			String LOC_PROFILE_FIRST_NAME = "id=txtFirstName";
			String LOC_PROFILE_LAST_NAME = "id=txtLastName";
			String LOC_PROFILE_CITY_NAME = "id=txtCity";
			String LOC_PROFILE_STATE_NAME = "id=txtState";
			String LOC_PROFILE_COUNTRY_DROPDOWN = "xpath=.//*[@id='profileDialog']//select[contains(@data-bind,'countries')]";
			String LOC_PROFILE_PHONE_NO = "id=txtPhone";
			String LOC_PROFILE_UPDATE_BTN = "xpath=.//*[@id='profileDialog']//button[text()='Update']";
			String LOC_TOAST_PROFILE_SAVED = "xpath=.//*[@id='toast-container']//div[contains(text(),'Profile saved successfully')]";
			String LOC_DOMAINS_OPTION = "xpath=.//*[@id='applicationHost']//a[contains(text(),'Domains')]";
			String LOC_DOMAINS_WINODW = "xpath=.//*[@id='manageDomainDialog']/div[@class='modal-dialog popup']";
			String LOC_DOMAIN_PAGINATION = "xpath=.//*[@id='manageDomainDialog']//div[contains(@class,'pagination-right')]";
			String LOC_ADD_DOMAIN_BTN = "xpath=.//*[@id='manageDomainDialog']//button[contains(@data-bind,'AddDomain')]";
			String LOC_ADD_DOMAIN_WINDOW = "xpath=.//*[@id='addDomainDialog']/div[@class='modal-dialog']";
			String LOC_TXT_DOMAIN_NAME = "id=txtDomainName";
			String LOC_ADD_BTN = "xpath=.//*[@id='addDomainDialog']//button[text()='Add']";
			String LOC_TOAST_DOMAIN_ADDED = "xpath=.//*[@id='toast-container']//div[contains(text(),'Domain added successfully')]";
			String LOC_TOAST_DOMAIN_INVALID = "xpath=.//*[@id='toast-container']//div[contains(text(),'Domain not valid')]";
			String LOC_TOAST_DOMAIN_EXIST = "xpath=.//*[@id='toast-container']//div[contains(text(),'Domain already exist')]";
			String LOC_TOAST_DOMAIN_STATUS = "xpath=.//*[@id='toast-container']//div[contains(text(),'Domain status changed successfully')]";
			String LOC_ADMIN_PANEL_CLOSE_BTN = "xpath=.//button[@class='close modalclose']/span";
			String LOC_DOMAIN_RESTRICTION_MSG = "xpath=.//*[@id='syncBody']//h3[contains(text(),' The following external recipients cannot be created due to a domain restriction in your environment')]";
			String LOC_POPUP_CLOSE_BTN = "xpath=.//*[@id='syncBody']//button[text()='Close' and @class='btn btn-success']";
			String LOC_TXT_SEARCH_ADMIN_PANEL = "xpath=.//input[contains(@data-bind,'searchName')]";
			String LOC_DOMAIN_SEARCH_BTN = "id=btnDomainSearch";
			String LOC_DELETE_DOMAIN_CONF_MSG = "xpath=.//*[@id='syncBody']//p[contains(text(),'Are you sure you want to delete this Domain?')]";
			String LOC_POPUP_OK_BTN = "xpath=.//button[text()='Ok']";
			String LOC_CSV_BTN = "xpath=.//button[contains(text(),'CSV')]";
			String LOC_PDF_BTN = "xpath=.//button[contains(text(),'PDF')]";
			String LOC_MANAGE_OPTION = "xpath=.//*[@id='applicationHost']//a[contains(text(),'Manage')]";
			String LOC_MANAGE_WINDOW = "xpath=.//*[@id='manageUserDialog']/div[@class='modal-dialog popup']";
			String LOC_USER_SEARCH_BTN = "css=#btnUserSearch";
			String LOC_USER_MANAGE_ACTIVITY_LOGS = "xpath=.//*[@id='manageUserDialog']//a[text()='Activity Logs']";
			String LOC_NO_ACTIVITY_LOG_MSG = "xpath=.//*[@id='activityMonitorDialog']//b[text()='No activity logs found.']";
			String LOC_USER_MANAGE_ACTIVITY_LOG_WINDOW = "xpath=.//*[@id='activityMonitorDialog']//h3[contains(text(),'Activity Logs')]";
			String LOC_ADMIN_PANEL_PAGINATION = "xpath=.//div[@class='pagination pagination-right popup-pagination']";
			String LOC_ACTIVITY_LOGS_CLOSE_BTN = "xpath=.//*[@id='activityMonitorDialog']//button[@class='close modalclose']/span";
			String LOC_USER_MANAGE_VIEW_CONTENT = "xpath=.//*[@id='manageUserDialog']//a[text()='View Contents']";
			String LOC_VIEW_CONTENTS_WINDOW = "xpath=.//*[@id='viewContentDialog']/div[@class='modal-dialog popup']";
			String LOC_CONTENT_IN_VIEW_CONTENTS_WINDOW = "xpath=.//*[@id='ultreeview']/li[contains(@data-bind,\"'selectednode': isClick\")]";
			String LOC_CONTENT_WINDOW_CLOSE_BTN = "xpath=.//*[@id='viewContentDialog']//button[@class='close modalclose']/span";
			String LOC_USER_MANAGE_EDIT_PROFILE = "xpath=.//*[@id='manageUserDialog']//a[text()='Edit']";
			String LOC_USER_STATU_ACTIVATE = "xpath=.//*[@id='manageUserDialog']//a[text()='Active']";
			String LOC_USER_STATU_DEACTIVATE = "xpath=.//*[@id='manageUserDialog']//a[text()='Deactivate']";
			String LOC_USER_NOT_ACTIVE = "xpath=.//*[@id='ErrorLabel' and text()='User is not active']";
			String LOC_RECYCLEBIN_OPTION = "xpath=.//*[@id='applicationHost']//a[contains(text(),'Recycle Bin')]";
			String LOC_RECYCLEBIN_WINDOW = "xpath=.//*[@id='deletedFileDialog']/div[@class='modal-dialog popup']";
			String LOC_DELETEDFILE_SEARCH_BTN = "id=btnDeletedFileSearch";
			String LOC_RECOVER_MULTIPLE_BTN = "xpath=.//*[@id='deletedFileDialog']//button[text()='Recover Multiple']";
			String LOC_RECOVER_ERROR_TOAST_MSG = "xpath=.//*[@id='toast-container']//div[contains(text(),'Please select more than 1 file to recover')]";
			String LOC_RECYCLEBIN_SORT_FILENAME = "xpath=.//*[@id='documentName']/i";
			String LOC_RECYCLEBIN_SORT_OWNERNAME = "xpath=.//*[@id='userName']/i";
			String LOC_RECYCLEBIN_SORT_DATE = "xpath=.//*[@id='modifiedDate']/i";
			String LOC_RECYCLEBIN_SORT_PARENT_FOLDER_NAME = "xpath=.//*[@id='folderName']/i";
			String LOC_REPORTS_OPTION = "xpath=.//*[@id='applicationHost']//a[contains(text(),'Reports')]";
			String LOC_REPORTS_WINODW = "xpath=.//*[@id='reportDialog']/div[@class='modal-dialog']";
			String LOC_USER_SUMMARY = "xpath=.//*[@id='reportDialog']//a[text()='User Summary']";
			String LOC_USER_SUMMARY_FROM_DATE_PICKER = "xpath=.//*[@id='userSummary']//div[contains(@id,'useractivityfromdatepicker')]/span";
			String LOC_USER_SUMMARY_TO_DATE_PICKER = "xpath=.//*[@id='userSummary']//div[contains(@id,'extusertodatepicker')]/span";
			String LOC_DATEPICKER_SWITCH = "xpath=.//*[@id='syncBody']//th[@class='datepicker-switch']";
			String LOC_USER_SUMMARY_SEARCH_BTN = "xpath=.//*[@id='btnAdminUserSearch' and contains(@data-bind,'UserActivitySummary')]";
			String LOC_USER_SUMMARY_CONTENT = "xpath=.//*[@id='userSummary']//div[@id='divUserActivityList']";
			String LOC_USER_SUMMARY_NO_CONTENT = "xpath=.//*[@id='userSummary']//div[@id='divUserActivityList']/table[contains(@style,'display: none')]";
			String LOC_USER_SUMMARY_FROM_DATE_PICKER_TXT = "xpath=.//*[@id='userSummary']//div[contains(@id,'useractivityfromdatepicker')]/input";
			String LOC_USER_SUMMARY_CREATED_ON_FIELD = "xpath=.//*[@id='tblUserActivityContent']//td[2]";
			String LOC_USER_SUMMARY_USER_NAME_FIELD = "xpath=.//*[@id='tblUserActivityContent']//td[contains(@data-bind,'UserName')]";
			String LOC_USER_SUMMARY_TXT_SEARCH = "xpath=.//*[@id='txtSearch' and contains(@data-bind,'ActivityUserNameSearch')]";
			String LOC_USER_SUMMARY_CSV_BTN = "xpath=.//button[contains(text(),'CSV') and contains(@data-bind,'UserActivityCSVFunc')]";
			String LOC_USER_SUMMARY_PDF_BTN = "xpath=.//button[contains(text(),'PDF') and contains(@data-bind,'UserActivityPDFFunc')]";
			String LOC_USER_SUMMARY_SORT_USERNAME = "xpath=.//table[@id='tblUserActivityContent']//th[@id='UserName']/i";
			String LOC_USER_SUMMARY_SORT_CREATED_ON = "xpath=.//*[@id='CreatedOn']/i";
			String LOC_USER_SUMMARY_SORT_MODIFIED_ON = "xpath=.//*[@id='ModifiedOn']/i";
			String LOC_USER_LOGGED_STATISTICS = "xpath=.//*[@id='reportDialog']//a[text()='User Logged Statistics']";
			String LOC_USER_LOGGED_STATISTICS_CONTENT = "id=barCanvas";
			String LOC_USER_LOGGED_STATISTICS_FROM_DATE_PICKER = "xpath=.//*[@id='userStatisticsFromDate']/span";
			String LOC_USER_LOGGED_STATISTICS_TO_DATE_PICKER = "xpath=.//*[@id='userStatisticsToDate']/span";
			String LOC_USER_LOGGED_STATISTICS_SEARCH_BTN = "xpath=.//*[@id='btnUserStatisSearch'  and contains(@data-bind,'UserStatistics')]";
			String LOC_USER_LOGGED_STATISTICS_SEARCH_TXT = "id=txtUserStatSearch";
			String LOC_GRAPH_TABLE = "xpath=.//*[@id='activityStatisticDialog']/div/div";
			String LOC_GRAPH_TABLE_CLOSE_BTN = "xpath=.//div[@class='modal-dialog popup']//button[@class='close modalclose']/span";
			String LOC_USER_STORAGE_SUMMARY = "xpath=.//*[@id='reportDialog']//a[text()='Storage Summary']";
			String LOC_USER_STORAGE_SUMMARY_CONTENT = "xpath=.//*[@id='userStorageSummary']//div[@id='divUserList']/table[contains(@style,'display: table')]";
			String LOC_USER_STORAGE_SUMMARY_TXT_SEARCH = "xpath=.//*[@id='txtUserNameSearch' and contains(@data-bind,'searchByUserName')]";
			String LOC_USER_STORAGE_SUMMARY_SEARCH_BTN = "xpath=.//*[@id='btnUserStorageSummary' and contains(@data-bind,'UserStorageSummary')]";
			String LOC_USER_STORAGE_SUMMARY_USER_NAME_FIELD = "xpath=.//*[@id='tblUserStorage']//td[contains(@data-bind,'UserName')]";
			String LOC_USER_STORAGE_SUMMARY_CSV_BTN = "xpath=.//button[contains(text(),'CSV') and contains(@data-bind,'StorageSummaryCSVFunc')]";
			String LOC_USER_STORAGE_SUMMARY_PDF_BTN = "xpath=.//button[contains(text(),'PDF') and contains(@data-bind,'StorageSummaryPDFFunc')]";
			String LOC_USER_STORAGE_SUMMARY_SORT_USERNAME = "xpath=.//div[@id='userStorageSummary']//th[@id='UserName']/i";
			String LOC_USER_STORAGE_SUMMARY_SORT_CREATED_DATE = "xpath=.//*[@id='CreatedDate']/i";
			String LOC_USER_STORAGE_SUMMARY_SORT_FILES_USED = "xpath=.//*[@id='TotalFilesCount']/i";
			String LOC_USER_STORAGE_SUMMARY_SORT_STORAGE_SIZE = "xpath=.//*[@id='TotalUsedStorage']/i";
			String LOC_EXTERNAL_USER_SUMMARY = "xpath=.//*[@id='reportDialog']//a[text()='External User Summary']";
			String LOC_EXTERNAL_USER_SUMMARY_CONTENT = "xpath=.//*[@id='externalUserSummary']//div[@id='divExternalUserList']";
			String LOC_EXTERNAL_USER_SUMMARY_FROM_DATE_PICKER = "xpath=.//*[@id='externalUserSummary']//div[contains(@id,'extuserfromdatepicker')]/span";
			String LOC_EXTERNAL_USER_SUMMARY_TO_DATE_PICKER = "xpath=.//*[@id='externalUserSummary']//div[contains(@id,'extusertodatepicker')]/span";
			String LOC_EXTERNAL_USER_SUMMARY_SEARCH_BTN = "xpath=.//*[@id='btnSearch' and contains(@data-bind,'ExternalUserSummary')]";
			String LOC_EXTERNAL_USER_SUMMARY_INVITED_ON_FIELD = "xpath=.//*[@id='tblExternalUserContent']//td[2]";
			String LOC_EXTERNAL_USER_SUMMARY_TXT_SEARCH = "xpath=.//*[@id='txtExternalUserSearch' and contains(@data-bind,'externalUserSearch')]";
			String LOC_EXTERNAL_USER_SUMMARY_CSV_BTN = "xpath=.//button[contains(text(),'CSV') and contains(@data-bind,'ExternalUserCSVFunc')]";
			String LOC_EXTERNAL_USER_SUMMARY_PDF_BTN = "xpath=.//button[contains(text(),'PDF') and contains(@data-bind,'ExternalUserPDFFunc')]";
			String LOC_EXTERNAL_USER_SUMMARY_NO_CONTENT = "xpath=.//*[@id='externalUserSummary']//div[@id='divExternalUserList']/table[contains(@style,'display: none')]";
			String LOC_EXTERNAL_USER_SUMMARY_SORT_USERNAME = "xpath=.//*[@id='Email']/i";
			String LOC_EXTERNAL_USER_SUMMARY_SORT_INVITED_DATE = "xpath=.//*[@id='InvitationDate']/i";
			String LOC_EXTERNAL_USER_SUMMARY_SORT_LAST_LOGIN = "xpath=.//*[@id='LastLoginTime']/i";
			String LOC_EXTERNAL_USER_SUMMARY_SORT_ADDED_BY = "xpath=.//*[@id='AddedBy']/i";
			String LOC_LOG_SHARED_ITEMS = "xpath=.//*[@id='reportDialog']//a[contains(text(),'Log of Shared Items')]";
			String LOC_SHARED_ITEMS_CONTENT = "xpath=.//*[@id='shared']//div[@id='divSharedItemList']";
			String LOC_SHARED_ITEMS_NO_CONTENT = "xpath=.//*[@id='shared']//div[@id='divSharedItemList']/table[contains(@style,'display: none')]";
			String LOC_SHARED_ITEMS_DOCUMENT_SEARCH_TXT = "id=txtSharedSearch";
			String LOC_SHARED_ITEMS_SEARCH_BTN = "xpath=.//*[@id='btnSearch' and contains(@data-bind,'SharedItemsLogs')]";
			String LOC_SHARED_ITEMS_SENDER_SEARCH_TXT = "id=txtsharedByUserSearch";
			String LOC_SHARED_ITEMS_RECIPIENT_SEARCH_TXT = "id=txtsharedToUserSearch";
			String LOC_SHARED_ITEMS_SHARED_TYPE_DROPDOWN = "xpath=.//*[@id='shared']//select[contains(@data-bind,'sharedTypeDrpList')]";
			String LOC_SHARED_ITEMS_EXPIRY_DATE_PICKER = "xpath=.//*[@id='sharedItemdatepicker']/span";
			String LOC_SHARED_ITEM_SORT_DOCUMENT_NAME = "xpath=.//*[@id='DocumentName']/i";
			String LOC_SHARED_ITEM_SORT_ITEM_TYPE = "xpath=.//*[@id='Type']/i";
			String LOC_SHARED_ITEM_SORT_SHARED_BY = "xpath=.//*[@id='SenderName']/i";
			String LOC_SHARED_ITEM_SORT_SHARED_WITH = "xpath=.//*[@id='ReceiverName']/i";
			String LOC_SHARED_ITEM_SORT_EXPIRATION = "xpath=.//*[@id='ExpiryDate']/i";
			String LOC_ADMIN_SUMMARY = "xpath=.//*[@id='reportDialog']//a[text()='Admin Summary']";
			String LOC_ADMIN_SUMMARY_CONTENT = "xpath=.//*[@id='adminSummary']//div[@id='divAdminUserList']";
			String LOC_ADMIN_SUMMARY_SEARCH_BTN = "xpath=.//*[@id='btnAdminUserSearch' and contains(@data-bind,'AdminSummary')]";
			String LOC_ADMIN_SUMMARY_FROM_DATE_PICKER = "xpath=.//*[@id='adminSummary']//div[contains(@id,'extuserfromdatepicker')]/span";
			String LOC_ADMIN_SUMMARY_TO_DATE_PICKER = "xpath=.//*[@id='adminSummary']//div[contains(@id,'extusertodatepicker')]/span";
			String LOC_ADMIN_SUMMARY_USERNAME_DROPDOWN = "xpath=.//*[@id='adminSummary']//label[contains(text(),'Username')]//following-sibling::div/select";
			String LOC_ADMIN_SUMMARY_USER_NAME_FIELD = "xpath=.//*[@id='tblAdminUserContent']//td[contains(@data-bind,'AdminName')]";
			String LOC_ADMIN_SUMMARY_CSV_BTN = "xpath=.//button[contains(text(),'CSV') and contains(@data-bind,'AdminActivityCSVFunc')]";
			String LOC_ADMIN_SUMMARY_PDF_BTN = "xpath=.//button[contains(text(),'PDF') and contains(@data-bind,'AdminActivityPDFFunc')]";
			String LOC_ADMIN_SUMMARY_ACTIVITY_DROPDOWN = "xpath=.//*[@id='adminSummary']//label[contains(text(),'Activity')]//following-sibling::div/select";
			String LOC_ADMIN_SUMMARY_ACTIVITY_FIELD = "xpath=.//*[@id='tblAdminUserContent']//td[contains(@data-bind,'Activity')]";
			String LOC_ADMIN_SUMMARY_SORT_USERNAME = "xpath=.//*[@id='AdminName']/i";
			String LOC_ADMIN_SUMMARY_SORT_CREATED_ON = "xpath=.//*[@id='dtCreatedOn']/i";
			String LOC_PREFERENCES_DROPDOWN = "xpath=.//*[@id='applicationHost']//a[contains(@class,'preference') and @data-toggle='dropdown']";
			String LOC_TRUSTED_DEVICES_OPTION = "xpath=.//*[@id='applicationHost']//a[text()='Trusted Devices']";
			String LOC_TRUSTED_DEVICES_WINDOW_CLOSE_BTN = "xpath=.//*[@id='listDeviceDialog']//button[@class='close modalclose']/span";
			String LOC_LOGOUT_OPTION = "id=logOutControl";
			String LOC_TRUSTED_DEIVCES_NAME_TXT = "xpath=.//*[@id='listDeviceDialog']//input[@class='form-control' and @style='']";
			String LOC_ABOUT_PAGE_LOGO = "xpath=.//*[@id='profileDialog']//img[contains(@data-bind,'src:AboutLogo()')]";
			String LOC_ABOUT_PAGE_VERSION = "xpath=.//*[@id='divBody']/p/span[contains(text(),'Version')]";
			String LOC_ABOUT_PAGE_CONTENT = "xpath=.//*[@id='divBody']/p";
			String LOC_ABOUT_PAGE_CLOSE_BTN = "xpath=.//*[@id='profileDialog']//button[@class='close modalclose']/span";
			String LOC_ABOUT_OPTION = "id=aboutControl";
			String LOC_LOGGED_OFF_MSG = "xpath=.//*[@id='form1']//span[contains(text(),\"You've successfully logged off\")]";
			String LOC_NOTIFICATION_PANEL = "xpath=.//*[@id='applicationHost']//ul[contains(@data-bind,'NotificationDetailsList')]";
			String LOC_NOTIFICATIONS_BTN = "css=.btn.btn-default.dropdown-toggle.info-number.bell-padding";
			String LOC_NOTIFICATION_TYPE_DROPDOWN = "css=.pull-right.notificatio-dropdown";
			String LOC_ALL_NOTIFICATIONS = "xpath=.//*[@id='applicationHost']//select[@class='pull-right notificatio-dropdown']/option[text()='All']";
			String LOC_DISMISS_ALL = "css=.notificatio-dismiss";
			String LOC_USER_ACTIVITY_STATISTICS = "xpath=.//*[@id='reportDialog']//a[text()='User Activity Statistics']";
			String LOC_USER_ACTIVITY_STATISTICS_CONTENT = "css=#stackedChart";
			String LOC_USER_ACTIVITY_STATISTICS_FROM_DATE_PICKER = "xpath=.//*[@id='userActivityStatistics']//div[contains(@id,'userActivityStatFromDate')]/span";
			String LOC_USER_ACTIVITY_STATISTICS_TO_DATE_PICKER = "xpath=.//*[@id='userActivityStatistics']//div[contains(@id,'userActivityStatToDate')]/span";
			String LOC_USER_ACTIVITY_STATISTICS_SEARCH_BTN = "css=#btnUserActivityStatisSearch";
			String LOC_USER_ACTIVITY_STATISTICS_SEARCH_TXT = "css=#txtUserActivityStSearch";
			String LOC_USER_ACTIVITY_STATISTICS_ACTIVITY_TYPE_DROPDOWN = "xpath=.//select[contains(@data-bind,'userActivityStatActivityType')]";
			String LOC_USER_ACTIVITY_STATISTICS_FROM_DATE_TXT = "xpath=.//*[@id='userActivityStatistics']//div[contains(@id,'userActivityStatFromDate')]/input";
			String LOC_USER_ACTIVITY_STATISTICS_TO_DATE_TXT = "xpath=.//*[@id='userActivityStatistics']//div[contains(@id,'userActivityStatToDate')]/input";
			String LOC_SYNC_LOGO_ON_PROFILE_DIALOG = "xpath=.//*[@id='profileDialog']//div[@class='logo']";
			String LOC_PROFILE_INVALID_FIRST_NAME_ALERT = "xpath=.//*[@id='profileDialog']//span[@class='validatefont' and contains(text(),'first name is invalid')]";
			String LOC_PROFILE_INVALID_LAST_NAME_ALERT = "xpath=.//*[@id='profileDialog']//span[@class='validatefont' and contains(text(),'last name is invalid')]";
			String LOC_TOAST_INVALID_CITY_NAME = "xpath=.//*[@id='toast-container']//div[contains(text(),'City can not contain any of the characters ~!@#$%^&*()_')]";
			String LOC_TOAST_INVALID_STATE_NAME = "xpath=.//*[@id='toast-container']//div[contains(text(),'State can not contain any of the characters ~!@#$%^&*()_')]";
			String LOC_TOAST_INVALID_DEVICE_NAME = "xpath=.//*[@id='toast-container']//div[contains(text(),'specified device name is invalid')]";
			String LOC_PROFILE_USER_TYPE_DROP_DOWN = "xpath=.//*[@id='profileDialog']//select[contains(@data-bind,'usertypes')]";
			String LOC_VIEW_CONTENT_ACTIVITY_LOGS_ICON = "xpath=.//*[@id='ultreeview']//span[contains(@data-bind,'Activity Logs')]";
			String LOC_ACTIVITY_LOGS_WINDOW_CONTENT = "xpath=.//*[@id='activityMonitorDialog']//div[contains(@class,'contentbody')]";
			String LOC_VIEW_CONTENT_DOWNLOAD_ICON = "xpath=.//*[@id='ultreeview']//span[contains(@data-bind,'Download')]";
			String LOC_ACTIVITY_LOG_WINDOW_PAGINATION = "xpath=.//*[@id='activityMonitorDialog']//div[contains(@class,'pagination pagination-right popup-pagination')]";
			String LOC_TOAST_INVALID_DATE = "xpath=.//*[@id='toast-container']//div[contains(text(),'From date cannot be greater than to date')]";
			String LOC_PAGINATION_IN_REPORTS = "xpath=.//*[@id='divPagination']";
			String LOC_SHARED_ITEM_NO_RECORDS_FOUND = "xpath=.//*[@id='divNoShareItemsLogsRecord']";
			String LOC_FORGOT_PASSWORD = "id=hlForgotPassword";
			String LOC_RESET_PASSWORD_EMAIL_TXT = "id=txtEmailId";
			String LOC_RESET_YOUR_PASSWORD_BTN = "xpath=.//*[@id='btnSubmit' and contains(@value,'Reset your password')]";
			String LOC_OPTION_CHANGE_PASSWORD = "xpath=.//*[@id='applicationHost']//a[contains(text(),'Change password')]";
			String LOC_OLD_PASSWORD_TXT = "xpath=.//*[@id='syncBody']//input[contains(@data-bind,'oldPassword')]";
			String LOC_NEW_PASSWORD_TXT = "xpath=.//*[@id='syncBody']//input[contains(@data-bind,'newPassword')]";
			String LOC_CONFIRM_PASSWORD_TXT = "xpath=.//*[@id='syncBody']//input[contains(@data-bind,'confirmPassword')]";
			String LOC_NOTIFICATIONS_PANEL = "xpath=.//*[@class='popover-scroll']";
			String LOC_ADMIN_PANEL_WINDOW_NEXT_BTN = "xpath=.//a[contains(@data-bind,' click:$root.getActivity') and contains(text(),'Next')]";
			String LOC_ADMIN_PANEL_WINDOW_PREV_BTN = "xpath=.//a[contains(@data-bind,' click:$root.getActivity') and contains(text(),'Prev')]";
			String LOC_ADMIN_PANEL_WINDOW_LAST_BTN = "xpath=.//a[contains(@data-bind,'click:$root.getActivity') and contains(text(),'Last')]";
			String LOC_ADMIN_PANEL_WINDOW_FIRST_BTN = "xpath=.//a[contains(@data-bind,'click:$root.getActivity') and contains(text(),'First')]";
		}
	}
}