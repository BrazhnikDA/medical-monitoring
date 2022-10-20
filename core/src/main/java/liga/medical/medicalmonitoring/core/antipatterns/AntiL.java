package liga.medical.medicalmonitoring.core.antipatterns;

public class AntiL {
        protected int width;
        protected int height;

        public void setWidth(int width)
        {
            this.width = width;
        }

        public void setHeight(int height)
        {
            this.height = height;
        }

        public int getWidth()
        {
            return width;
        }

        public int getHeight()
        {
            return height;
        }

    class Square extends AntiL
    {
        public void setWidth(int width)
        {
            setWidth(width);
            setHeight(width);
        }

        public void setHeight(int height)
        {
            setHeight(height);
            setWidth(height);
        }
    }

    public int calculateRectangleSquare(AntiL rectangle, int width, int height)
    {
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        return rectangle.getHeight() * rectangle.getWidth();
    }

    //calculateRectangleSquare(new AntiL, 4, 5); // 20
    //calculateRectangleSquare(new Square, 4, 5); // 25
}
