package crc64bc19060be64db354;


public class CollectionViewItemViewBorder
	extends crc64f0082c958c44238f.BorderViewGroup
	implements
		mono.android.IGCUserPeer,
		android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"n_onAccessibilityStateChanged:(Z)V:GetOnAccessibilityStateChanged_ZHandler:Android.Views.Accessibility.AccessibilityManager/IAccessibilityStateChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.CollectionView.CollectionViewItemViewBorder, Telerik.Maui.Controls", CollectionViewItemViewBorder.class, __md_methods);
	}

	public CollectionViewItemViewBorder (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == CollectionViewItemViewBorder.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionView.CollectionViewItemViewBorder, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public CollectionViewItemViewBorder (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CollectionViewItemViewBorder.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionView.CollectionViewItemViewBorder, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public CollectionViewItemViewBorder (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CollectionViewItemViewBorder.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionView.CollectionViewItemViewBorder, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public CollectionViewItemViewBorder (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CollectionViewItemViewBorder.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionView.CollectionViewItemViewBorder, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();

	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

	public void onAccessibilityStateChanged (boolean p0)
	{
		n_onAccessibilityStateChanged (p0);
	}

	private native void n_onAccessibilityStateChanged (boolean p0);

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
