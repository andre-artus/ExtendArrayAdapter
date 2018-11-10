package com.example.extendarrayadapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class WordAdapter(context: Context, objects: List<Word>) :
    ArrayAdapter<Word>(context, R.layout.list_item, R.id.default_text_view, objects) {

    private class ViewHolder(row: View) {
        init {
            row.tag = this
        }

        val defaultTextView = row.findViewById<TextView>(R.id.default_text_view)!!
        val miwokTextView = row.findViewById<TextView>(R.id.miwok_text_view)!!
    }

    private val translatedString = context.getString(R.string.six_text)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View =
        super.getView(position, convertView, parent).also { row ->
            (row.tag as? ViewHolder ?: ViewHolder(row)).apply {
                getItem(position)?.run {
                    defaultTextView.text = when (defaultTranslation) {
                        "six" -> translatedString
                        else -> defaultTranslation
                    }

                    miwokTextView.text = miwokTranslation
                }
            }
        }
}