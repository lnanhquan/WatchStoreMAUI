package crc64832d2d70531c7f33;


public class CalendarContentHost_ContentHostLayoutViewGroup
	extends crc6452ffdc5b34af3a0f.LayoutViewGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_dispatchTouchEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.Calendar.CalendarContentHost+ContentHostLayoutViewGroup, Telerik.Maui.Controls", CalendarContentHost_ContentHostLayoutViewGroup.class, __md_methods);
	}

	public CalendarContentHost_ContentHostLayoutViewGroup (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == CalendarContentHost_ContentHostLayoutViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.Calendar.CalendarContentHost+ContentHostLayoutViewGroup, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public CalendarContentHost_ContentHostLayoutViewGroup (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CalendarContentHost_ContentHostLayoutViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.Calendar.CalendarContentHost+ContentHostLayoutViewGroup, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public CalendarContentHost_ContentHostLayoutViewGroup (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CalendarContentHost_ContentHostLayoutViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.Calendar.CalendarContentHost+ContentHostLayoutViewGroup, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public CalendarContentHost_ContentHostLayoutViewGroup (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CalendarContentHost_ContentHostLayoutViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.Calendar.CalendarContentHost+ContentHostLayoutViewGroup, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public boolean dispatchTouchEvent (android.view.MotionEvent p0)
	{
		return n_dispatchTouchEvent (p0);
	}

	private native boolean n_dispatchTouchEvent (android.view.MotionEvent p0);

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
