import java.util.ArrayList;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.swt.widgets.Label;
import blog.*;


public class Blogentry {

	protected Shell shell;
	public java.util.List<BlogContent> blogcontents = new ArrayList<BlogContent>();
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtNewText;
	private Text txtNewText_1;
	private Text txtNewText_2;
	private Text txtNewText_3;
	private List list;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Blogentry window = new Blogentry();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(514, 385);
		shell.setText("SWT Application");
		
		Form frmNewForm = formToolkit.createForm(shell);
		frmNewForm.setBounds(10, 10, 241, 311);
		formToolkit.paintBordersFor(frmNewForm);
		frmNewForm.setText("Blog Entry");
		
		txtNewText = formToolkit.createText(frmNewForm.getBody(), "New Text", SWT.NONE);
		txtNewText.setText("");
		txtNewText.setBounds(10, 25, 61, 21);
		
		Label lblTitel = formToolkit.createLabel(frmNewForm.getBody(), "Titel", SWT.NONE);
		lblTitel.setBounds(10, 10, 55, 15);
		
		txtNewText_1 = formToolkit.createText(frmNewForm.getBody(), "New Text", SWT.NONE);
		txtNewText_1.setText("");
		txtNewText_1.setBounds(10, 73, 208, 122);
		
		txtNewText_2 = formToolkit.createText(frmNewForm.getBody(), "New Text", SWT.NONE);
		txtNewText_2.setBounds(35, 215, 61, 21);
		
		txtNewText_3 = formToolkit.createText(frmNewForm.getBody(), "New Text", SWT.NONE);
		txtNewText_3.setBounds(142, 215, 61, 21);
		
		Label lblText = formToolkit.createLabel(frmNewForm.getBody(), "Text", SWT.NONE);
		lblText.setBounds(10, 52, 55, 15);
		
		Button btnSubmitBlogEntry = new Button(frmNewForm.getBody(), SWT.NONE);
		btnSubmitBlogEntry.setBounds(105, 244, 126, 25);
		btnSubmitBlogEntry.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				BlogContent b = new BlogContent();
				b.content = txtNewText.getText();
				blogcontents.add(b);
			}
		});
		btnSubmitBlogEntry.setText("Submit blog entry");
		
		list = new List(shell, SWT.BORDER);
		list.setBounds(257, 10, 231, 311);
		formToolkit.adapt(list, true, true);

	}
	public List getList() {
		return list;
	}
}
