package com.example.a3ipsoftwareproject;

import android.os.Parcel;
import android.os.Parcelable;

public class Pkmn implements Parcelable {
    int id;
    String pokemon;
    String bodytype;
    String type1;
    String type2;

    // constructors
    public Pkmn(){
        super();
    }

    public Pkmn(int id, String pokemon, String bodytype, String type1, String type2){
        super();
        this.id = id;
        this.pokemon = pokemon;
        this.bodytype = bodytype;
        this.type1 = type1;
        this.type2 = type2;
    }

    public Pkmn(String pokemon, String bodytype, String type1, String type2){
        this.pokemon = pokemon;
        this.bodytype = bodytype;
        this.type1 = type1;
        this.type2 = type2;
    }


    protected Pkmn(Parcel in) {
        id = in.readInt();
        pokemon = in.readString();
        bodytype = in.readString();
        type1 = in.readString();
        type2 = in.readString();
    }

    public static final Creator<Pkmn> CREATOR = new Creator<Pkmn>() {
        @Override
        public Pkmn createFromParcel(Parcel in) {
            return new Pkmn(in);
        }

        @Override
        public Pkmn[] newArray(int size) {
            return new Pkmn[size];
        }
    };

    //getters
    public int getId() {
        return id;
    }

    public String getPokemon() {
        return pokemon;
    }

    public String getBodytype() { return bodytype; }

    public String getType1(){ return type1; }

    public String getType2(){ return type2; }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(pokemon);
        parcel.writeString(bodytype);
        parcel.writeString(type1);
        parcel.writeString(type2);
    }
}
