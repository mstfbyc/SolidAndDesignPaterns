package com.bilgeadam.designpatterns.structural.decorator;

public class ReportApp {
    public static void main(String[] args) {
        String content = getReportContent();
        String text;

        //String text = getBaseReport(content);
        //text = getStripedReport(content);
        //text = getStripedAndSmall(content);
        text = getStripedAndSmallAndSinged(content);

        System.out.println(text);


    }

    private static String getStripedAndSmallAndSinged(String content) {
        BaseReport baseReport = new BaseReport(content);
        StripedReportDecorator stripedReportDecorator = new StripedReportDecorator(baseReport);
        SmallReportDecorator smallReportDecorator = new SmallReportDecorator(stripedReportDecorator);
        SignedReportDecorator decorator = new SignedReportDecorator(smallReportDecorator);
        return decorator.getText();
    }

    private static String getStripedAndSmall(String content) {
        BaseReport baseReport = new BaseReport(content);
        StripedReportDecorator stripedReportDecorator = new StripedReportDecorator(baseReport);
        SmallReportDecorator decorator = new SmallReportDecorator(stripedReportDecorator);
        return decorator.getText();
    }

    private static String getStripedReport(String content) {
        BaseReport baseReport = new BaseReport(content);
        StripedReportDecorator decorator = new StripedReportDecorator(baseReport);
        return decorator.getText();
    }

    private static String getBaseReport(String content) {
        BaseReport baseReport = new BaseReport(content);
        return baseReport.getText();
    }

    private static String getReportContent() {
        String content = "Lorem Ipsum Nedir?\n" +
                "\nLorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının bir " +
                "\nhurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler " +
                "\nolarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de " +
                "\nsıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker " +
                "\ngibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";
        return content;

    }
}
