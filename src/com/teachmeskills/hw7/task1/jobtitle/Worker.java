package com.teachmeskills.hw7.task1.jobtitle;

import com.teachmeskills.hw7.task1.idisplayingjobtitle.IDisplayingJobTitle;

/**
 * Class for positions "Worker"
 * contains fields jobTitle and id
 * contains constructor
 * contains required method for displaying job title.
 */
public class Worker implements IDisplayingJobTitle {
    public String jobTitle;
    public long id;

    public Worker(String jobTitle, long id) {
        this.jobTitle = jobTitle;
        this.id = id;
    }

    @Override
    public void displayJobTitle() {
        System.out.println("Requested job title: " + jobTitle);
    }
}
