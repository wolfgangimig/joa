Dim outlook
set outlook = CreateObject("Outlook.Application")

Dim explorer
Set explorer = outlook.Application.ActiveExplorer
Dim atts
Set atts = explorer.AttachmentSelection
MsgBox ("#atts=" & atts.Count)