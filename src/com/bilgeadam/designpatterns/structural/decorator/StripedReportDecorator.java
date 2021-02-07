package com.bilgeadam.designpatterns.structural.decorator;

public class StripedReportDecorator extends ReportDecorator{

    public StripedReportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String getText() {
        String text = super.getText();

        String stripedText = ReportUtil.getStripedText(text);
        return stripedText;
    }
}
