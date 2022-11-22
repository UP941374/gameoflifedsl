/**
 * generated by Xtext 2.28.0
 */
package goldsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import goldsl.TasksDSLRuntimeModule;
import goldsl.TasksDSLStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TasksDSLIdeSetup extends TasksDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    TasksDSLRuntimeModule _tasksDSLRuntimeModule = new TasksDSLRuntimeModule();
    TasksDSLIdeModule _tasksDSLIdeModule = new TasksDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_tasksDSLRuntimeModule, _tasksDSLIdeModule));
  }
}
