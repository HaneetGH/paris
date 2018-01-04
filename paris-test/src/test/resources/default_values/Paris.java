package com.airbnb.paris.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.paris.proxies.ImageViewProxyStyleApplier;
import com.airbnb.paris.proxies.TextViewProxyStyleApplier;
import com.airbnb.paris.proxies.ViewGroupProxyStyleApplier;
import com.airbnb.paris.proxies.ViewProxyStyleApplier;
import com.airbnb.paris.spannable.SpannableBuilder;

public final class Paris {
  public static ImageViewProxyStyleApplier style(ImageView view) {
    return new ImageViewProxyStyleApplier(view);
  }

  public static ImageViewProxyStyleApplier.StyleBuilder styleBuilder(ImageView view) {
    return new ImageViewProxyStyleApplier.StyleBuilder(new ImageViewProxyStyleApplier(view));
  }

  public static MyOtherViewStyleApplier style(MyOtherView view) {
    return new MyOtherViewStyleApplier(view);
  }

  public static MyOtherViewStyleApplier.StyleBuilder styleBuilder(MyOtherView view) {
    return new MyOtherViewStyleApplier.StyleBuilder(new MyOtherViewStyleApplier(view));
  }

  public static MyViewStyleApplier style(MyView view) {
    return new MyViewStyleApplier(view);
  }

  public static MyViewStyleApplier.StyleBuilder styleBuilder(MyView view) {
    return new MyViewStyleApplier.StyleBuilder(new MyViewStyleApplier(view));
  }

  public static TextViewProxyStyleApplier style(TextView view) {
    return new TextViewProxyStyleApplier(view);
  }

  public static TextViewProxyStyleApplier.StyleBuilder styleBuilder(TextView view) {
    return new TextViewProxyStyleApplier.StyleBuilder(new TextViewProxyStyleApplier(view));
  }

  public static ViewGroupProxyStyleApplier style(ViewGroup view) {
    return new ViewGroupProxyStyleApplier(view);
  }

  public static ViewGroupProxyStyleApplier.StyleBuilder styleBuilder(ViewGroup view) {
    return new ViewGroupProxyStyleApplier.StyleBuilder(new ViewGroupProxyStyleApplier(view));
  }

  public static ViewProxyStyleApplier style(View view) {
    return new ViewProxyStyleApplier(view);
  }

  public static ViewProxyStyleApplier.StyleBuilder styleBuilder(View view) {
    return new ViewProxyStyleApplier.StyleBuilder(new ViewProxyStyleApplier(view));
  }

  /**
   * For debugging */
  public static void assertStylesContainSameAttributes(Context context) {
  }

  public static SpannableBuilder spannableBuilder() {
    return new SpannableBuilder();
  }
}