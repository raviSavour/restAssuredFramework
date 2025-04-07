# restAssuredFramework
Rest Assured for restful api automation



api-testing-framework/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── utils/              # Excel Reader, Config Loader, etc.
│   │       └── constants/          # API URLs, Test Data Paths
│   ├── test/
│   │   └── java/
│   │       └── tests/              # Test classes
│   │       └── payloads/           # POJOs or JSON body builders
│   │       └── requestBuilders/    # Request building logic
│   │       └── dataProviders/      # Excel-driven TestNG data providers
│
├── testdata/
│   └── loginData.xlsx              # Excel test data
│
├── pom.xml
└── testng.xml
