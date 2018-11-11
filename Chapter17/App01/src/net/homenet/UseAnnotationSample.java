package net.homenet;

public class UseAnnotationSample {
    @UseAnnotation(number = 1)
    public void annotationSample1() { }

    @UseAnnotation(number = 2, text = "second")
    public void annotationSample2() { }

    @UseAnnotation(number = 3, text = "third")
    public void annotationSample3() { }
}
