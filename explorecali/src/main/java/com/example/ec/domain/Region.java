package com.example.ec.domain;
/*Enumeration of the region of California.*/

public enum Region {
    Central_Coast("Central Coast"), Southern_California("Southern California"), Northen_California("Northen California"),
    Varies("Varies");

    private String label;
    private Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String byLabel) {
        for (Region r : Region.values()) {
            if(r.label.equalsIgnoreCase(byLabel)) {
                return r;
            }
        }
        return null;
    }

}
