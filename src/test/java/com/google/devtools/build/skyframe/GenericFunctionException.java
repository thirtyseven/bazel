// Copyright 2014 Google Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.skyframe;

/**
 * A {@link SkyFunctionException} wrapping a {@link SomeErrorException}.
 */
public final class GenericFunctionException extends SkyFunctionException {
  public GenericFunctionException(SomeErrorException e, Transience transience) {
    super(e, transience);
  }

  public GenericFunctionException(SomeErrorException e, SkyKey childKey) {
    super(e, childKey);
  }
}