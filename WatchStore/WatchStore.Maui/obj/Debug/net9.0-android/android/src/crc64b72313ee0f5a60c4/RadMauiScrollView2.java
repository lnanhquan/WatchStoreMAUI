package crc64b72313ee0f5a60c4;


public class RadMauiScrollView2
	extends androidx.core.widget.NestedScrollView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onScrollChanged:(IIII)V:GetOnScrollChanged_IIIIHandler\n" +
			"n_requestLayout:()V:GetRequestLayoutHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Platform.RadMauiScrollView2, Telerik.Maui.Core", RadMauiScrollView2.class, __md_methods);
	}

	public RadMauiScrollView2 (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RadMauiScrollView2.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.RadMauiScrollView2, Telerik.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public RadMauiScrollView2 (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RadMauiScrollView2.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.RadMauiScrollView2, Telerik.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public RadMauiScrollView2 (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RadMauiScrollView2.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.RadMauiScrollView2, Telerik.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);

	public void onScrollChanged (int p0, int p1, int p2, int p3)
	{
		n_onScrollChanged (p0, p1, p2, p3);
	}

	private native void n_onScrollChanged (int p0, int p1, int p2, int p3);

	public void requestLayout ()
	{
		n_requestLayout ();
	}

	private native void n_requestLayout ();

	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
