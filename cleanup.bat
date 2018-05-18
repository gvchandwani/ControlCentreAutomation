@echo on
set dump_path=%1
set max_days=%2
forfiles -p %dump_path% -d -%max_days% -c "cmd /c IF @isdir == TRUE rd /S /Q @path"