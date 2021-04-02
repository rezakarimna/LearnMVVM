package com.learnmvvm.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;

import com.squareup.picasso.Picasso;

public class Users {

    private String name, email, linkImg;

    @BindingAdapter({"android:imageUser"})
    public static void loadImageUser(ImageView imgUser, String linkImg) {
        Picasso.get().load(linkImg).into(imgUser);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }
}
