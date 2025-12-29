package crc64bc19060be64db354;


public class CollectionViewItemDelegate
	extends androidx.core.view.AccessibilityDelegateCompat
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitializeAccessibilityNodeInfo:(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V:GetOnInitializeAccessibilityNodeInfo_Landroid_view_View_Landroidx_core_view_accessibility_AccessibilityNodeInfoCompat_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.CollectionView.CollectionViewItemDelegate, Telerik.Maui.Controls", CollectionViewItemDelegate.class, __md_methods);
	}

	public CollectionViewItemDelegate ()
	{
		super ();
		if (getClass () == CollectionViewItemDelegate.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionView.CollectionViewItemDelegate, Telerik.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public CollectionViewItemDelegate (android.view.View.AccessibilityDelegate p0)
	{
		super (p0);
		if (getClass () == CollectionViewItemDelegate.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionView.CollectionViewItemDelegate, Telerik.Maui.Controls", "Android.Views.View+AccessibilityDelegate, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public void onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1)
	{
		n_onInitializeAccessibilityNodeInfo (p0, p1);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1);

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
