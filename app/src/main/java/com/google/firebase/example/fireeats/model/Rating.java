package com.google.firebase.example.fireeats.model;

import android.text.TextUtils;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;
// todo Rating 的基本類別
/**
 * Model POJO for a rating.
 */
public class Rating extends Model {

    public String userId;
    public String userName;
    public double rating;
    public String text;
    public @ServerTimestamp
    Date timestamp;

    public Rating() {
    }

    public Rating(FirebaseUser user, double rating, String text) {
        // todo 取得 user 相關資訊的方式
        this.userId = user.getUid();
        this.userName = user.getDisplayName();
        if (TextUtils.isEmpty(this.userName)) {
            this.userName = user.getEmail();
        }

        this.rating = rating;
        this.text = text;
    }
}
