/*
 * Copyright 2021 Sebastián Rojas Rodriguez sebastian.rojas04@alumnos.ucn.cl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.srojas.thenews.model;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.apache.commons.lang3.mutable.Mutable;

import java.util.List;

/**
 *The ViewModel of the News.
 *
 * @author Sebastián Rojas
 */
public final class NewsViewModel extends AndroidViewModel {

    private MutableLiveData<List<News>> news;

    public NewsViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<News>> getNews() {

        if(this.news == null) {
            this.news = new MutableLiveData<>();
            this.loadNews();
        }
        return this.news;
    }

    /**
     * Read the news from the json file.
     */
    private void loadNews() {

        AsyncTask.execute(() -> {

            List<News> theNews;

        });

    }
}
