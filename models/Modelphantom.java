// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelphantom extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer wing0;
	private final ModelRenderer wingtip0;
	private final ModelRenderer wing1;
	private final ModelRenderer wingtip1;
	private final ModelRenderer head;
	private final ModelRenderer tail;
	private final ModelRenderer tailtip;

	public Modelphantom() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 8).addBox(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);

		wing0 = new ModelRenderer(this);
		wing0.setRotationPoint(2.0F, -2.0F, -8.0F);
		body.addChild(wing0);
		setRotationAngle(wing0, 0.0F, 0.0F, 0.0873F);
		wing0.setTextureOffset(23, 12).addBox(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);

		wingtip0 = new ModelRenderer(this);
		wingtip0.setRotationPoint(6.0F, 0.0F, 0.0F);
		wing0.addChild(wingtip0);
		setRotationAngle(wingtip0, 0.0F, 0.0F, 0.1745F);
		wingtip0.setTextureOffset(16, 24).addBox(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F, 0.0F, false);

		wing1 = new ModelRenderer(this);
		wing1.setRotationPoint(-3.0F, -2.0F, -8.0F);
		body.addChild(wing1);
		setRotationAngle(wing1, 0.0F, 0.0F, -0.0873F);
		wing1.setTextureOffset(23, 12).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, 0.0F, true);

		wingtip1 = new ModelRenderer(this);
		wingtip1.setRotationPoint(-6.0F, 0.0F, 0.0F);
		wing1.addChild(wingtip1);
		setRotationAngle(wingtip1, 0.0F, 0.0F, -0.1745F);
		wingtip1.setTextureOffset(16, 24).addBox(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, -7.0F);
		body.addChild(head);
		head.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -2.0F, 1.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.0873F, 0.0F, 0.0F);
		tail.setTextureOffset(3, 20).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		tailtip = new ModelRenderer(this);
		tailtip.setRotationPoint(0.0F, 0.5F, 6.0F);
		tail.addChild(tailtip);
		setRotationAngle(tailtip, -0.0873F, 0.0F, 0.0F);
		tailtip.setTextureOffset(4, 29).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.wing1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.wing0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}