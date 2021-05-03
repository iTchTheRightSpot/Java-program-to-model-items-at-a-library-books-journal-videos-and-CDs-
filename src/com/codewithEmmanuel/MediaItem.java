package com.codewithEmmanuel;

public abstract class MediaItem extends Item {
    private double runtime;

    public MediaItem(int id_number, String title, String ItemAvailable, int available_copies, double runtime) {
        super(id_number, title, ItemAvailable, available_copies);
        this.runtime = runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }
    public double getRuntime() {
        return runtime;
    }



}
