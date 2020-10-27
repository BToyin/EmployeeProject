package com.sparta.toyin.View;

public class Printer {

    public static void printDataMigrationTime(long start, long end) {

        System.out.println("Loading the data from the csv file took: " + ((end-start)) +" milliseconds");
        Log.traceLog((end-start), "Migration of data from the csv file in milliseconds: ");
    }

    public static void printDataPersistenceTime(long start, long end) {

        System.out.println("Uploading the data to the database took: " + ((end-start)/1000) +" seconds");
    }

    public static void printRecords(int number) {
        System.out.println("Number of records in employees: " + number);
        Log.traceLog(number, "The following number of entries are migrated to employees collection: ");
    }
    public static void printDuplicateRecords(int number) {
        System.out.println("Number of records in Duplicate employees :" + number);
        Log.traceLog(number, "The following number of entries are migrated to employees duplicates collection: ");
    }

    public static void printRecordsPersisted(int number) {
        System.out.println("Number of entries successfully inserted to database: " + number);
        Log.traceLog(number, "The following number of entries were persisted successfully: ");
    }

    public static void printErrorMessage() {
        System.out.println("Some or all of the data could not be persisted");
        Log.traceLog("Some or all of the data could not be persisted to the data base");
    }

    public static void printSuccessfulConnection() {
        System.out.println("Connection To database was made successfully!");
    }
}
