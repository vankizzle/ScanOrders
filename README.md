# OrdersSoftware

# 1. Configure the WEB Api
  - Setup the host url in Program.cs<br/> 
  - Setup the RestApi\.vs\config\applicationhost.config for the desired URL - use CurrentIP:8080 or create and use custom port<br/>
  - Open CMD -> netsh http add urlacl url=http://CurrentIP:8080/ user=everyone<br/>
  - Open CMD -> cd to solution folder -> dotnet run<br/>

# 1.1 To Debug the WEB API 
  - Do step 1(One)<br/>
  - Open VS<br/>
  - Debug > Attach to process > find the active process and attach to it<br/>

# 1.2 To see DB
  - Do step 1(one) atleast once in order to create the db and tables<br/>
  - Open MSSMS and connect to the server entered in DataContext.cs<br/>
  
# 2. Configure the Desktop App
  - Changed the IP and Port in BaseViewModel.cs<br/>
  
# 3. Configure the Mobile App
  - Change the IP and Port in Support.bas<br/>
