package org.fmod.lowlevel;

import org.fmod.jni.SWIGTYPE_p_FMOD_GEOMETRY;

import java.util.Objects;

/**
 * Author: Nate
 * Date: 5/1/2015
 */
public class Geometry {
	private final SWIGTYPE_p_FMOD_GEOMETRY pointer;

	Geometry(SWIGTYPE_p_FMOD_GEOMETRY pointer) {
		this.pointer = pointer;
	}

	public SWIGTYPE_p_FMOD_GEOMETRY getPointer() {
		return pointer;
	}
	
//FMOD_RESULT F_API FMOD_Geometry_Release                 (FMOD_GEOMETRY *geometry);

/*
     Polygon manipulation.
*/

//FMOD_RESULT F_API FMOD_Geometry_AddPolygon              (FMOD_GEOMETRY *geometry, float directocclusion, float reverbocclusion, FMOD_BOOL doublesided, int numvertices, const FMOD_VECTOR *vertices, int *polygonindex);
//FMOD_RESULT F_API FMOD_Geometry_GetNumPolygons          (FMOD_GEOMETRY *geometry, int *numpolygons);
//FMOD_RESULT F_API FMOD_Geometry_GetMaxPolygons          (FMOD_GEOMETRY *geometry, int *maxpolygons, int *maxvertices);
//FMOD_RESULT F_API FMOD_Geometry_GetPolygonNumVertices   (FMOD_GEOMETRY *geometry, int index, int *numvertices);
//FMOD_RESULT F_API FMOD_Geometry_SetPolygonVertex        (FMOD_GEOMETRY *geometry, int index, int vertexindex, const FMOD_VECTOR *vertex);
//FMOD_RESULT F_API FMOD_Geometry_GetPolygonVertex        (FMOD_GEOMETRY *geometry, int index, int vertexindex, FMOD_VECTOR *vertex);
//FMOD_RESULT F_API FMOD_Geometry_SetPolygonAttributes    (FMOD_GEOMETRY *geometry, int index, float directocclusion, float reverbocclusion, FMOD_BOOL doublesided);
//FMOD_RESULT F_API FMOD_Geometry_GetPolygonAttributes    (FMOD_GEOMETRY *geometry, int index, float *directocclusion, float *reverbocclusion, FMOD_BOOL *doublesided);

/*
     Object manipulation.
*/

//FMOD_RESULT F_API FMOD_Geometry_SetActive               (FMOD_GEOMETRY *geometry, FMOD_BOOL active);
//FMOD_RESULT F_API FMOD_Geometry_GetActive               (FMOD_GEOMETRY *geometry, FMOD_BOOL *active);
//FMOD_RESULT F_API FMOD_Geometry_SetRotation             (FMOD_GEOMETRY *geometry, const FMOD_VECTOR *forward, const FMOD_VECTOR *up);
//FMOD_RESULT F_API FMOD_Geometry_GetRotation             (FMOD_GEOMETRY *geometry, FMOD_VECTOR *forward, FMOD_VECTOR *up);
//FMOD_RESULT F_API FMOD_Geometry_SetPosition             (FMOD_GEOMETRY *geometry, const FMOD_VECTOR *position);
//FMOD_RESULT F_API FMOD_Geometry_GetPosition             (FMOD_GEOMETRY *geometry, FMOD_VECTOR *position);
//FMOD_RESULT F_API FMOD_Geometry_SetScale                (FMOD_GEOMETRY *geometry, const FMOD_VECTOR *scale);
//FMOD_RESULT F_API FMOD_Geometry_GetScale                (FMOD_GEOMETRY *geometry, FMOD_VECTOR *scale);
//FMOD_RESULT F_API FMOD_Geometry_Save                    (FMOD_GEOMETRY *geometry, void *data, int *datasize);

/*
     Userdata set/get.
*/

//FMOD_RESULT F_API FMOD_Geometry_SetUserData             (FMOD_GEOMETRY *geometry, void *userdata);
//FMOD_RESULT F_API FMOD_Geometry_GetUserData             (FMOD_GEOMETRY *geometry, void **userdata);


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Geometry geometry = (Geometry) o;
		return Objects.equals(pointer, geometry.pointer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointer);
	}
}
