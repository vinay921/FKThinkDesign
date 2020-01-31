class obsRef {

    double[][] data;

    public obsRef(double[][] data)
    {
        this.data = data;
    }

    public double[] diameter()
    {
        double[] diameters = new double[data.length];

        for(int i=0;i<data.length;i++)
        {
            diameters[i] = data[i][0]+data[i][1]*2;
        }

        return diameters;
    }

}

