package com.ramo.sweetlistadapter;

import android.view.View;

public interface ISweetSetItemView<T> {
    void setItemView(View view, T item);
}
