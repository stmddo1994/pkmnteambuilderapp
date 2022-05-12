package com.example.a3ipsoftwareproject;

import android.os.Parcel;
import android.os.Parcelable;

public class Moves implements Parcelable {

    String move;
    String type;

    //constructors
    public Moves(){
    }

    public Moves(String move, String type){
        this.move = move;
        this.type = type;
    }

    protected Moves(Parcel in) {
        move = in.readString();
        type = in.readString();
    }

    public static final Creator<Moves> CREATOR = new Creator<Moves>() {
        @Override
        public Moves createFromParcel(Parcel in) {
            return new Moves(in);
        }

        @Override
        public Moves[] newArray(int size) {
            return new Moves[size];
        }
    };

    //setters
    public void setMove(String move) {
        this.move = move;
    }

    public void setType(String type) {
        this.type = type;
    }

    //getters
    public String getMove() {
        return this.move;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(move);
        parcel.writeString(type);
    }

    @Override
    public String toString(){
        return getMove();
    }
}
