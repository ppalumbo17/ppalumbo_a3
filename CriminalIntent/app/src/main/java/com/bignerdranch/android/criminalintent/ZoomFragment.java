package com.bignerdranch.android.criminalintent;

import android.animation.Animator;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by Peter on 2/29/2016.
 */
public class ZoomFragment extends DialogFragment {

    private static final String EXTRA_IMAGE = "com.bignerdranch.android.criminal.image";
    private static final String ARG_IMAGE = "image";

    private Animator mCurrentAnimator;

    public static ZoomFragment newInstance(File image){
        Bundle args = new Bundle();
        args.putSerializable(ARG_IMAGE, image);
        ZoomFragment fragment = new ZoomFragment();
        fragment.setArguments(args);
        return fragment;

    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        super.onCreateDialog(savedInstanceState);

        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_zoom, null);

        File photoFile = (File)getArguments().getSerializable(ARG_IMAGE);

        Bitmap image = PictureUtils.getScaledBitmap(photoFile.getPath(), getActivity());

        ImageView scaledImage = (ImageView) v.findViewById(R.id.large_image);
        scaledImage.setImageBitmap(image);

        return new AlertDialog.Builder(getActivity()).setView(scaledImage).create();


    }
}
