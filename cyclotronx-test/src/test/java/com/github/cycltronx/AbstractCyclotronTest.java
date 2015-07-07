package com.github.cycltronx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.Environment;

/**
 * Created by jbrisbin on 7/7/15.
 */
public abstract class AbstractCyclotronTest {

  public static final Environment ENV;

  static {
    ENV = Environment.initializeIfEmpty()
                     .assignErrorJournal();
  }

  protected final Logger log = LoggerFactory.getLogger(getClass());

}
