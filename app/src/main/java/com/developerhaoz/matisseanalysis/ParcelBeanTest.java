package com.developerhaoz.matisseanalysis;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by developerHaoz on 2017/8/17.
 */

public class ParcelBeanTest implements Parcelable {

    private String name;
    private String job;
    private int age;

    public ParcelBeanTest(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public static final Parcelable.Creator<ParcelBeanTest> CREATOR = new Parcelable.Creator<ParcelBeanTest>() {
        @Override
        public ParcelBeanTest createFromParcel(Parcel source) {
            return new ParcelBeanTest(source);
        }

        @Override
        public ParcelBeanTest[] newArray(int size) {
            return new ParcelBeanTest[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.job);
        dest.writeInt(this.age);
    }

    protected ParcelBeanTest(Parcel in) {
        this.name = in.readString();
        this.job = in.readString();
        this.age = in.readInt();
    }

    @Override
    public String toString() {
        return "This name is " + this.getName() + "This job is " + this.getJob() + "This age is " + this.getAge();
    }
}
