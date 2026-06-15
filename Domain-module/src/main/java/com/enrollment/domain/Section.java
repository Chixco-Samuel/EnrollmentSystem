package com.enrollment.domain;

public class Section {
    private final String sectionId;
    private final String sectionName;

    public Section(String sectionId, String sectionName) {
        this.sectionId = sectionId;
        this.sectionName = sectionName;
    }

    public String getSectionId() { return sectionId; }
    public String getSectionName() { return sectionName; }
}
