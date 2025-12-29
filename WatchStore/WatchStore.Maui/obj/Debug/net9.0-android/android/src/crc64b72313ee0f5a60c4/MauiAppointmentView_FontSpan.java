package crc64b72313ee0f5a60c4;


public class MauiAppointmentView_FontSpan
	extends android.text.style.MetricAffectingSpan
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_updateDrawState:(Landroid/text/TextPaint;)V:GetUpdateDrawState_Landroid_text_TextPaint_Handler\n" +
			"n_updateMeasureState:(Landroid/text/TextPaint;)V:GetUpdateMeasureState_Landroid_text_TextPaint_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Platform.MauiAppointmentView+FontSpan, Telerik.Maui.Core", MauiAppointmentView_FontSpan.class, __md_methods);
	}

	public MauiAppointmentView_FontSpan ()
	{
		super ();
		if (getClass () == MauiAppointmentView_FontSpan.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.MauiAppointmentView+FontSpan, Telerik.Maui.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public MauiAppointmentView_FontSpan (android.graphics.Typeface p0, float p1)
	{
		super ();
		if (getClass () == MauiAppointmentView_FontSpan.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.MauiAppointmentView+FontSpan, Telerik.Maui.Core", "Android.Graphics.Typeface, Mono.Android:System.Single, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public void updateDrawState (android.text.TextPaint p0)
	{
		n_updateDrawState (p0);
	}

	private native void n_updateDrawState (android.text.TextPaint p0);

	public void updateMeasureState (android.text.TextPaint p0)
	{
		n_updateMeasureState (p0);
	}

	private native void n_updateMeasureState (android.text.TextPaint p0);

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
