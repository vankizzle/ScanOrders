# OrdersSoftware

# 1. Configure the WEB Api
  -Setup the host url in Program.cs
  -Setup the RestApi\.vs\config\applicationhost.config for the desired URL - use CurrentIP:8080 or create and use custom port
  -Open CMD -> netsh http add urlacl url=http://CurrentIP:8080/ user=everyone
  -Open CMD -> cd to solution folder -> dotnet run

# 1.1 To Debug the WEB API 
  1.Do step 1(One)
  2.Open VS
  3.Debug > Attach to process > find the active process and attach to it

# 1.2 To see DB
  1.Do step 1(one) atleast once in order to create the db and tables
  2.Open MSSMS and connect to the server entered in DataContext.cs
  
# 2. Configure the Desktop App
  - Changed the IP and Port in BaseViewModel.cs
  
# 3. Configure the Mobile App
- Change the IP and Port in Support.bas
