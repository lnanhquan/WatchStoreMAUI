using Microsoft.Maui.Controls;
using Microsoft.Maui.Controls.Xaml;

namespace Telerik.Theming.Telerik.Styles;

[XamlCompilation(XamlCompilationOptions.Compile)]
public partial class Chat : ResourceDictionary
{
	public Chat(ResourceDictionary buttons, ResourceDictionary entry)
	{
		this.MergedDictionaries.Add(buttons);
		this.MergedDictionaries.Add(entry);
		InitializeComponent();
	}
}