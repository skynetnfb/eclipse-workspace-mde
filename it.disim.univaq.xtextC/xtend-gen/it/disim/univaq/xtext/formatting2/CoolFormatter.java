/**
 * generated by Xtext 2.25.0
 */
package it.disim.univaq.xtext.formatting2;

import com.google.inject.Inject;
import cooltivar.Application;
import cooltivar.ItemProcess;
import cooltivar.Problem;
import cooltivar.Solution;
import cooltivar.User;
import it.disim.univaq.xtext.services.CoolGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class CoolFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private CoolGrammarAccess _coolGrammarAccess;
  
  protected void _format(final Application application, @Extension final IFormattableDocument document) {
    EList<User> _user = application.getUser();
    for (final User user : _user) {
      document.<User>format(user);
    }
  }
  
  protected void _format(final User user, @Extension final IFormattableDocument document) {
    EList<Solution> _solutions = user.getSolutions();
    for (final Solution solution : _solutions) {
      document.<Solution>format(solution);
    }
    EList<Problem> _problems = user.getProblems();
    for (final Problem problem : _problems) {
      document.<Problem>format(problem);
    }
    EList<ItemProcess> _itemProcess = user.getItemProcess();
    for (final ItemProcess itemProcess : _itemProcess) {
      document.<ItemProcess>format(itemProcess);
    }
    EList<cooltivar.Process> _process = user.getProcess();
    for (final cooltivar.Process process : _process) {
      document.<cooltivar.Process>format(process);
    }
  }
  
  public void format(final Object user, final IFormattableDocument document) {
    if (user instanceof XtextResource) {
      _format((XtextResource)user, document);
      return;
    } else if (user instanceof User) {
      _format((User)user, document);
      return;
    } else if (user instanceof Application) {
      _format((Application)user, document);
      return;
    } else if (user instanceof EObject) {
      _format((EObject)user, document);
      return;
    } else if (user == null) {
      _format((Void)null, document);
      return;
    } else if (user != null) {
      _format(user, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(user, document).toString());
    }
  }
}
