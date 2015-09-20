/*
   Copyright 2012 David "Destil" Vavra

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.destil.gpsaveraging.ui.activity;

import android.support.v4.app.Fragment;

import org.destil.gpsaveraging.base.BaseActivity;
import org.destil.gpsaveraging.ui.fragment.AboutFragment;

/**
 * Shows about information, support etc.
 *
 * @author Destil
 */
public class AboutActivity extends BaseActivity {

    @Override
    public Fragment getFragment() {
        return new AboutFragment();
    }

    @Override
    public boolean shouldShowUpArrow() {
        return true;
    }
}