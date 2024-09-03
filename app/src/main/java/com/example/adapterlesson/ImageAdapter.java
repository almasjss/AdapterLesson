package com.example.adapterlesson;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private int[] mImages;

    public ImageAdapter(Context context, int[] mImages) {
        this.context = context;
        this.mImages = mImages;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int[] getmImages() {
        return mImages;
    }

    public void setmImages(int[] mImages) {
        this.mImages = mImages;
    }

    @Override
    public int getCount() {
        return mImages.length;
    }

    @Override
    public Object getItem(int position) {
        return mImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView==null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new
                     Gallery.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mImages[position]);
        return imageView;
        }
    }
