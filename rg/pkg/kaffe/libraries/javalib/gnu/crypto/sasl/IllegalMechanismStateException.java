package gnu.crypto.sasl;

// ----------------------------------------------------------------------------
// $Id: IllegalMechanismStateException.java,v 1.2 2005/10/20 12:05:36 alexa Exp $
//
// Copyright (C) 2003, Free Software Foundation, Inc.
//
// This file is part of GNU Crypto.
//
// GNU Crypto is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2, or (at your option)
// any later version.
//
// GNU Crypto is distributed in the hope that it will be useful, but
// WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; see the file COPYING.  If not, write to the
//
//    Free Software Foundation Inc.,
//    51 Franklin Street, Fifth Floor,
//    Boston, MA 02110-1301
//    USA
//
// Linking this library statically or dynamically with other modules is
// making a combined work based on this library.  Thus, the terms and
// conditions of the GNU General Public License cover the whole
// combination.
//
// As a special exception, the copyright holders of this library give
// you permission to link this library with independent modules to
// produce an executable, regardless of the license terms of these
// independent modules, and to copy and distribute the resulting
// executable under terms of your choice, provided that you also meet,
// for each linked independent module, the terms and conditions of the
// license of that module.  An independent module is a module which is
// not derived from or based on this library.  If you modify this
// library, you may extend this exception to your version of the
// library, but you are not obligated to do so.  If you do not wish to
// do so, delete this exception statement from your version.
// ----------------------------------------------------------------------------

import javax.security.sasl.AuthenticationException;

/**
 * A checked exception thrown to indicate that an operation that should be
 * invoked on a completed mechanism was invoked but the authentication phase of
 * that mechanism was not completed yet, or that an operation that should be
 * invoked on incomplete mechanisms was invoked but the authentication phase of
 * that mechanism was already completed.
 *
 * @version $Revision: 1.2 $
 */
public class IllegalMechanismStateException extends AuthenticationException {

	/**
	 * Constructs a new instance of <code>IllegalMechanismStateException</code>
    * with no detail message.
	 */
   public IllegalMechanismStateException() {
      super();
   }

	/**
	 * Constructs a new instance of <code>IllegalMechanismStateException</code>
    * with the specified detail message.
	 *
	 * @param detail the detail message.
	 */
   public IllegalMechanismStateException(String detail) {
      super(detail);
   }

	/**
	 * Constructs a new instance of <code>IllegalMechanismStateException</code>
    * with the specified detail message, and cause.
	 *
	 * @param detail the detail message.
	 * @param ex the original cause.
	 */
   public IllegalMechanismStateException(String detail, Throwable ex) {
      super(detail, ex);
   }
}