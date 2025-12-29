package crc64b72313ee0f5a60c4;


public class RadMauiTextInput
	extends androidx.appcompat.widget.AppCompatEditText
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBeginBatchEdit:()V:GetOnBeginBatchEditHandler\n" +
			"n_onEndBatchEdit:()V:GetOnEndBatchEditHandler\n" +
			"n_onTextChanged:(Ljava/lang/CharSequence;III)V:GetOnTextChanged_Ljava_lang_CharSequence_IIIHandler\n" +
			"n_onSelectionChanged:(II)V:GetOnSelectionChanged_IIHandler\n" +
			"n_onFocusChanged:(ZILandroid/graphics/Rect;)V:GetOnFocusChanged_ZILandroid_graphics_Rect_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Platform.RadMauiTextInput, Telerik.Maui.Core", RadMauiTextInput.class, __md_methods);
	}

	public RadMauiTextInput (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RadMauiTextInput.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.RadMauiTextInput, Telerik.Maui.Core", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public RadMauiTextInput (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RadMauiTextInput.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.RadMauiTextInput, Telerik.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public RadMauiTextInput (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RadMauiTextInput.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Platform.RadMauiTextInput, Telerik.Maui.Core", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public void onBeginBatchEdit ()
	{
		n_onBeginBatchEdit ();
	}

	private native void n_onBeginBatchEdit ();

	public void onEndBatchEdit ()
	{
		n_onEndBatchEdit ();
	}

	private native void n_onEndBatchEdit ();

	public void onTextChanged (java.lang.CharSequence p0, int p1, int p2, int p3)
	{
		n_onTextChanged (p0, p1, p2, p3);
	}

	private native void n_onTextChanged (java.lang.CharSequence p0, int p1, int p2, int p3);

	public void onSelectionChanged (int p0, int p1)
	{
		n_onSelectionChanged (p0, p1);
	}

	private native void n_onSelectionChanged (int p0, int p1);

	public void onFocusChanged (boolean p0, int p1, android.graphics.Rect p2)
	{
		n_onFocusChanged (p0, p1, p2);
	}

	private native void n_onFocusChanged (boolean p0, int p1, android.graphics.Rect p2);

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
