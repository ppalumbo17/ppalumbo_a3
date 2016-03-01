package com.bignerdranch.android.criminalintent;

import android.animation.Animator;
import android.app.Dialog;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by Peter on 2/29/2016.
 */
public class ZoomFragment extends DialogFragment {

    private static final String EXTRA_IMAGE = "com.bignerdranch.android.criminal.image";
    private static final String ARG_IMAGE = "image";

    private Animator mCurrentAnimator;

    public static ZoomFragment newInstance(Image image){
        Bundle args = new Bundle();
        args.putSerializable(ARG_IMAGE, image);



    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

    }
}
