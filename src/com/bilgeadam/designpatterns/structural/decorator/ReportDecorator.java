package com.bilgeadam.designpatterns.structural.decorator;

public abstract class ReportDecorator implements IReport {
    private IReport report;

    public ReportDecorator(IReport report) {
        this.report = report;
    }

    @Override
    public String getText() {
        return report.getText();
    }
}
