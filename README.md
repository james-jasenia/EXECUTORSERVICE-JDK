# Executor Service Framework - Java Development Kit

## Purpose:
The purpose of this codebase is to explore the ExecutorService interface and how tasks can be delegated to service for async exectution. 


## Purpose: 
The purpose of this app is to explore the Room Library and how it provides a layer of abstraction over SQLite to allow database access. Specifically, I am wanting to explore the 'convenience annotations' that minimise error-prone code (SQL). The documentation highly recommendeds that you Room instead of using the SQLite APIs directly. 

##### Room Documentation: https://developer.android.com/training/data-storage/room?gclid=Cj0KCQiAlsv_BRDtARIsAHMGVSapV4bg9VhEDDfKxyhK2fuLiPLOf8n7JzNkSMuzUBRrEcU-T2The1gaAsceEALw_wcB&gclsrc=aw.ds

## Setup:
Check the documentation for the dependencies you need to add to your app's build.gradle file. You may need to revisit the version number every now and then.


## Primary Components:

### Data Entities
#### @Entity
Use this annotation in your model to let the compiler know that you want the model to be an entity.
