/*********************************************************************
*
*      Copyright (C) 2003 Andrew Khan
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
***************************************************************************/

package jxl.common.log;


/**
 * A logger which uses the log4j library from jakarta.  Each instance
 * of this class acts as a wrapper to the log4j Logger class
 */
public class Log4JLogger extends jxl.common.Logger
{
  /**
   * Constructor invoked by the getLoggerImpl method to return a logger
   * for a particular class
   */
  private Log4JLogger()
  {
    super();
  }

  /**
   *  Log a debug message
   */
  public void debug(Object message)
  {
  }

  /**
   * Log a debug message and exception
   */
  public void debug(Object message, Throwable t)
  {
  }

  /**
   *  Log an error message
   */
  public void error(Object message)
  {
  }

  /**
   * Log an error message object and exception
   */
  public void error(Object message, Throwable t)
  {
  }

  /**
   * Log a fatal message
   */
  public void fatal(Object message)
  {
  }

  /**
   * Log a fatal message and exception
   */
  public void fatal(Object message, Throwable t)
  {
  }

  /**
   * Log an information message
   */
  public void info(Object message)
  {
  }

  /**
   * Logs an information message and an exception
   */

  public void info(Object message, Throwable t)
  {
  }

  /**
   * Log a warning message object
   */
  public void warn(Object message)
  {
  }

  /**
   * Log a warning message with exception
   */
  public void warn(Object message, Throwable t)
  {
  }

  /**
   * Accessor to the logger implementation
   */
  protected jxl.common.Logger getLoggerImpl(Class cl)
  {
    return new Log4JLogger();
  }
}
