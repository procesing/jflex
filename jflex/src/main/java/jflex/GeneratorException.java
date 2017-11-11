/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * JFlex 1.7.0-SNAPSHOT                                                    *
 * Copyright (C) 1998-2015  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package jflex;

import java.io.IOException; /**
 * Thrown when code generation has to be aborted.
 *
 * @author Gerwin Klein
 * @version JFlex 1.7.0-SNAPSHOT
 */
public class GeneratorException extends RuntimeException {

  private static final long serialVersionUID = -9128247888544263982L;

  public GeneratorException() {
    super();
  }

  public GeneratorException(ErrorMessages messageFormat, Object... args) {
    super(ErrorMessages.get(messageFormat, args));
  }

  public GeneratorException(Throwable cause, ErrorMessages messageFormat, Object... args) {
    super(ErrorMessages.get(messageFormat, args), cause);
  }

  public GeneratorException(Throwable cause) {
    super(cause);
  }
}
