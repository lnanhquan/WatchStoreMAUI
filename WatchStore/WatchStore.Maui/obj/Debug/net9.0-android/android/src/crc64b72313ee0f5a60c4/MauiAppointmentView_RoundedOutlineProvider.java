package crc64b72313ee0f5a60c4;


public class MauiAppointmentView_RoundedOutlineProvider
	extends android.view.ViewOutlineProvider
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getOutline:(Landroid/view/View;Landroid/graphics/Outline;)V:GetGetOutline_Landroid_view_View_Landroid_graphics_Outline_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Platform.MauiAppointmentView+RoundedOutlineProvider, Telerik.Maui.Core", MauiAppointmentView_RoundedOutlineProvider.class, __md_methods);
	}

	public MauiAppointmentView_RoundedOutlineProvider ()
	{
		super ();
		if (getClass () == MauiAppointmentView_RoundedOutlineProvider.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.MauiAppointmentView+RoundedOutlineProvider, Telerik.Maui.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public MauiAppointmentView_RoundedOutlineProvider (float p0)
	{
		super ();
		if (getClass () == MauiAppointmentView_RoundedOutlineProvider.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.MauiAppointmentView+RoundedOutlineProvider, Telerik.Maui.Core", "System.Single, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}

	public void getOutline (android.view.View p0, android.graphics.Outline p1)
	{
		n_getOutline (p0, p1);
	}

	private native void n_getOutline (android.view.View p0, android.graphics.Outline p1);

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
