package crc6446c645097f661628;


public class GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup
	extends com.microsoft.maui.PlatformContentViewGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_getClipPath:(II)Landroid/graphics/Path;:GetGetClipPath_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.DataGrid.GroupAggregateCellTemplateVisualizable+ClipWrapperViewGroup, Telerik.Maui.Controls", GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup.class, __md_methods);
	}

	public GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup (android.content.Context p0)
	{
		super (p0);
		if (getClass () == GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.DataGrid.GroupAggregateCellTemplateVisualizable+ClipWrapperViewGroup, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.DataGrid.GroupAggregateCellTemplateVisualizable+ClipWrapperViewGroup, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.DataGrid.GroupAggregateCellTemplateVisualizable+ClipWrapperViewGroup, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == GroupAggregateCellTemplateVisualizable_ClipWrapperViewGroup.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.DataGrid.GroupAggregateCellTemplateVisualizable+ClipWrapperViewGroup, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);

	public android.graphics.Path getClipPath (int p0, int p1)
	{
		return n_getClipPath (p0, p1);
	}

	private native android.graphics.Path n_getClipPath (int p0, int p1);

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
