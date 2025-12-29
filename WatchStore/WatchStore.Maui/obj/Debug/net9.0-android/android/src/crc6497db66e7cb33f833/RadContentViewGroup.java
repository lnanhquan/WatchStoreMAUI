package crc6497db66e7cb33f833;


public class RadContentViewGroup
	extends crc6452ffdc5b34af3a0f.ContentViewGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_dispatchTouchEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_requestDisallowInterceptTouchEvent:(Z)V:GetRequestDisallowInterceptTouchEvent_ZHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.RadContentViewGroup, Telerik.Maui.Core", RadContentViewGroup.class, __md_methods);
	}

	public RadContentViewGroup (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RadContentViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.RadContentViewGroup, Telerik.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public RadContentViewGroup (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RadContentViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.RadContentViewGroup, Telerik.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public RadContentViewGroup (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RadContentViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.RadContentViewGroup, Telerik.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public RadContentViewGroup (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == RadContentViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.RadContentViewGroup, Telerik.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);

	public boolean dispatchTouchEvent (android.view.MotionEvent p0)
	{
		return n_dispatchTouchEvent (p0);
	}

	private native boolean n_dispatchTouchEvent (android.view.MotionEvent p0);

	public void requestDisallowInterceptTouchEvent (boolean p0)
	{
		n_requestDisallowInterceptTouchEvent (p0);
	}

	private native void n_requestDisallowInterceptTouchEvent (boolean p0);

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
