class Gen<T extends Number> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Tипoм Т является " + ob.getClass().getName());
    }

    boolean isEqual(Gen<? extends Number> obj){
        if (this.ob.equals(obj) ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        Gen<Double> strOb = new Gen<Double>(8.2);

        System.out.println(iOb.isEqual(strOb));

    }
}
