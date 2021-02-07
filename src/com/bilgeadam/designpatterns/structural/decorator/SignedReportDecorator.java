package com.bilgeadam.designpatterns.structural.decorator;

public class SignedReportDecorator extends ReportDecorator{
    public SignedReportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String getText() {
        String text = super.getText();
        String signedText = ReportUtil.addLastLineSing(text);
        return signedText;
    }
}
