package edu.nyu.scps.november16;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;


public class November16 extends View{
	Context context;
	
	public November16(Context context) {
		super(context);
		this.context = context;
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		final int width = getWidth();
		final int height = getHeight();
		
		//make background blue
		canvas.drawColor(Color.BLUE);	
		
		//draw body
		Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG); //smooth out the edges
		paint.setColor(Color.YELLOW);
		paint.setStyle(Paint.Style.FILL);	
		
		float radius = 0.3f * width; //body radius
		canvas.translate(width/2.0f, height/2.0f); //set origin to center of view		
		canvas.drawCircle(0, 0, radius, paint);
		
		//draw eyes
		paint.setColor(Color.BLACK);
		radius = 0.025f * width; //eye radius
		canvas.drawCircle(0.2f * width, 0, radius, paint); //draw right eye
		canvas.drawCircle(-0.2f * width, 0, radius, paint); //draw left eye
		
		//draw wings
		paint.setColor(Color.YELLOW);
		radius = 0.055f * width; //wing radius
		canvas.drawCircle(0.28f * width, 0.08f * height, radius, paint); //draw right wing
		canvas.drawCircle(-0.28f * width, 0.08f * height, radius, paint); //draw left wing
		
		//draw beak
		paint.setColor(Color.rgb(255, 165, 0));
		RectF oval = new RectF(-0.18f * width, 0.02f * height , 0.18f * width, 0.07f * height);
		canvas.drawOval(oval, paint);
		
	}

}
