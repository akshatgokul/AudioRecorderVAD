/*
 * Copyright 2018 Dmytro Ponomarenko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing  and
 * limitations under the License.
 */

package com.dimowner.audiorecorder;

public interface Contract {

	interface View {
		void showProgress();

		void hideProgress();

		void showError(String message);

		void showError(int resId);

		void showMessage(int resId);
	}

	interface UserActionsListener<T extends View> {

		void bindView(T view);

		void unbindView();

		void clear();
	}
}
